<template>
  <v-app-bar app>
    <div class="d-flex align-center ga-10 ml-5">
      <v-toolbar-title>
        <LogoComponent />
      </v-toolbar-title>

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
        @click="toggleTheme"
        density="comfortable"
      ></v-btn>
    </div>

    <div class="d-flex d-md-none align-center gap-0 mr-2">
      <v-btn icon="mdi-magnify" variant="text" density="comfortable" />
      <v-menu
        v-model="isMenuOpen"
        :close-on-content-click="false"
        location="bottom"
      >
        <template v-slot:activator="{ props }">
          <v-btn v-bind="props" icon="mdi-account-circle-outline" variant="text" density="comfortable" />
        </template>
        <NavMenu @close="isMenuOpen = false" />
      </v-menu>
    </div>
  </v-app-bar>
</template>

<script lang="ts" setup>
import LogoComponent from './LogoComponent.vue';
import NavButton from './navbar/NavButton.vue';
import NavMenu from './navbar/NavMenu.vue';
import { items, personal } from '@/configs/navbar';
import { onMounted, shallowRef, ref, inject } from 'vue'

const { current: theme, toggle: toggleTheme } = inject('theme') as { current: string, toggle: () => void };

const isLoggedIn = shallowRef(false);

const isMenuOpen = ref(false)

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
