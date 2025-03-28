<template>
  <v-app :theme="theme">
    <v-app-bar app>
      <v-toolbar-title>MTG Stats</v-toolbar-title>
      <v-spacer></v-spacer>
      <v-app-bar-nav-icon @click="drawer = !drawer" />
    </v-app-bar>
    <v-navigation-drawer v-model="drawer" location="right" temporary>
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
        prepend-icon="mdi-account-group"
        title="Players"
        value="players"
        ></v-list-item>
        <v-list-item
        prepend-icon="mdi-controller"
        title="Games"
        value="games"
        ></v-list-item>
        <v-list-item prepend-icon="mdi-cards" title="Decks" value="decks"></v-list-item>
        <v-list-item prepend-icon="mdi-star" title="Favorites" value="starred"></v-list-item>
      </v-list>

      <v-list density="compact" class="fixed-bottom">
        <v-list-item
          :prepend-icon="
            theme === 'light' ? 'mdi-white-balance-sunny' : 'mdi-moon-waning-crescent'
          "
          title="Toggle Theme"
          @click="toggleTheme"
        ></v-list-item>

        <v-list-item prepend-icon="mdi-logout" class="text-red-darken-2" title="Logout" @click="logout"></v-list-item>
      </v-list>
    </v-navigation-drawer>
    <v-main>
      <RouterView />
    </v-main>
  </v-app>
</template>

<script setup>
import { shallowRef } from 'vue'
import { RouterView } from 'vue-router'

const drawer = shallowRef(false)
const theme = shallowRef('light')

function toggleTheme() {
  theme.value = theme.value === 'light' ? 'dark' : 'light'
}

function logout() {
  console.log('logout')
}
</script>
