<template>
  <v-app-bar app>
    <div class="d-flex align-center ga-10 ml-5">
      <v-toolbar-title>MTG Stats</v-toolbar-title>

      <div class="align-center ga-3 d-none d-md-flex">
        <nav-button :items="items" />
        <v-divider class="mx-3" vertical v-if="isLoggedIn"></v-divider>
        <nav-button :items="personal" v-if="isLoggedIn" />
      </div>
    </div>

    <v-spacer></v-spacer>

    <div class="align-center ga-3 d-none d-md-flex mr-2">
      <router-link class="reset-style" to="/login">Login</router-link>
      <router-link class="reset-style" to="/register">Register</router-link>
      <v-text-field
        v-model="search"
        density="compact"
        label="Search"
        prepend-inner-icon="mdi-magnify"
        variant="solo-filled"
        flat
        hide-details
        single-line
        class="search-bar"
      ></v-text-field>
      <v-btn
        :icon="theme === 'dark' ? 'mdi-white-balance-sunny' : 'mdi-weather-night'"
        :color="theme === 'dark' ? 'white' : 'black'"
        @click="$emit('toggleTheme')"
        density="comfortable"
      ></v-btn>
    </div>

    <div class="d-flex d-md-none align-center gap-0 mr-2">
      <v-btn icon="mdi-magnify" variant="text" density="comfortable" />
      <v-menu
        v-model="menu"
        :close-on-content-click="false"
        location="end"
      >
      <template v-slot:activator="{ props }">
        <v-btn v-bind="props" icon="mdi-menu" variant="text" density="comfortable" />
      </template>

        <v-card min-width="300">
          <v-list>
            <v-list-item
              prepend-avatar="https://cdn.vuetifyjs.com/images/john.jpg"
              subtitle="Founder of Vuetify"
              title="John Leider"
            >
              <template v-slot:append>
                <v-btn
                  :class="fav ? 'text-red' : ''"
                  icon="mdi-heart"
                  variant="text"
                  @click="fav = !fav"
                ></v-btn>
              </template>
            </v-list-item>
          </v-list>

          <v-divider></v-divider>

          <v-list>
            <v-list-item>
              <v-switch
                v-model="message"
                color="purple"
                label="Enable messages"
                hide-details
              ></v-switch>
            </v-list-item>

            <v-list-item>
              <v-switch
                v-model="hints"
                color="purple"
                label="Enable hints"
                hide-details
              ></v-switch>
            </v-list-item>
          </v-list>

          <v-card-actions>
            <v-spacer></v-spacer>

            <v-btn
              variant="text"
              @click="menu = false"
            >
              Cancel
            </v-btn>
            <v-btn
              color="primary"
              variant="text"
              @click="menu = false"
            >
              Save
            </v-btn>
          </v-card-actions>
        </v-card>
      </v-menu>
    </div>
  </v-app-bar>
</template>

<script setup>
import NavButton from './buttons/NavButton.vue';
import { items, personal } from '@/configs/navbar';
import { defineProps, onMounted, shallowRef, ref } from 'vue'

const isLoggedIn = shallowRef(false);
const props = defineProps({
  theme: { type: String, required: true },
})

const fav = ref(true)
const menu = ref(false)
const message = ref(false)
const hints = ref(true)

onMounted(() => {
  const isLogin = localStorage.getItem('is_login');
  if (isLogin) {
    isLoggedIn.value = true;
  } else {
    isLoggedIn.value = false;
  }
});
</script>

<style lang="scss" scoped>
a.reset-style {
  color: inherit;
  text-decoration: none;
}
.search-bar {
  width: 200px;
}
.speed-dial {
  position: fixed;
  bottom: 20px;
  right: 20px;
}
</style>
