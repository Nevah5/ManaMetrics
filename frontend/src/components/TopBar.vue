<template>
  <v-app-bar app>
    <v-toolbar-title>MTG Stats</v-toolbar-title>

    <v-spacer></v-spacer>
    <v-btn
      v-for="item in navItems"
      :key="item.value"
      :prepend-icon="item.icon"
      class="d-md-flex d-none"
      text
    >
      {{ item.title }}
    </v-btn>

    <v-app-bar-nav-icon @click="drawer = !drawer" class="d-md-none" />
  </v-app-bar>

  <v-navigation-drawer v-model="drawer" location="right" temporary class="d-md-none">
    <v-list>
      <v-list-item
        prepend-avatar="https://xsgames.co/randomusers/assets/avatars/male/3.jpg"
        subtitle="@username"
        title="User Name"
      ></v-list-item>
    </v-list>

    <v-divider></v-divider>

    <v-list density="compact" nav>
      <v-list-item
        v-for="item in navItems"
        :key="item.value"
        :prepend-icon="item.icon"
        :title="item.title"
        :value="item.value"
      ></v-list-item>
    </v-list>

    <v-list density="compact" class="fixed-bottom">
      <v-list-item
        :prepend-icon="
          props.theme === 'light' ? 'mdi-white-balance-sunny' : 'mdi-moon-waning-crescent'
        "
        title="Toggle Theme"
        @click="$emit('toggle-theme')"
      ></v-list-item>

      <v-list-item
        prepend-icon="mdi-logout"
        class="text-red-darken-2"
        title="Logout"
        @click="logout"
      ></v-list-item>
    </v-list>
  </v-navigation-drawer>
</template>

<script setup>
import { shallowRef, defineProps } from 'vue'

const props = defineProps({
  theme: { type: String, required: true },
})

const drawer = shallowRef(false)

const navItems = [
  { icon: 'mdi-account-group', title: 'Players', value: 'players' },
  { icon: 'mdi-controller', title: 'Games', value: 'games' },
  { icon: 'mdi-cards', title: 'Decks', value: 'decks' },
  { icon: 'mdi-star', title: 'Favorites', value: 'starred' },
  { icon: 'mdi-magnify', title: 'Search', value: 'search' },
]

function logout() {
  console.log('logout')
}
</script>
