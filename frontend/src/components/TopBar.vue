<template>
  <v-app-bar app>
    <div class="d-flex align-center ga-10 ml-5">
      <v-toolbar-title>MTG Stats</v-toolbar-title>

      <div class="d-flex align-center ga-3">
        <nav-button :items="items" />
        <v-divider class="mx-3" vertical v-if="isLoggedIn"></v-divider>
        <nav-button :items="personal" v-if="isLoggedIn" />
      </div>
    </div>

    <v-spacer></v-spacer>

    <div class="d-flex align-center ga-3">
      <v-text-field
        v-model="search"
        density="compact"
        label="Search"
        prepend-inner-icon="mdi-magnify"
        variant="solo-filled"
        flat
        hide-details
        single-line
        class="search-bar mr-5"
      ></v-text-field>
      <router-link class="reset-style" to="/login">Login</router-link>
      <router-link class="reset-style" to="/register">Register</router-link>
      <v-btn
        :icon="theme === 'dark' ? 'mdi-white-balance-sunny' : 'mdi-weather-night'"
        :color="theme === 'dark' ? 'white' : 'black'"
        class="ma-2"
        @click="$emit('toggleTheme')"
      ></v-btn>
    </div>
  </v-app-bar>
</template>

<script setup>
import NavButton from './buttons/NavButton.vue';
import { items, personal } from '@/configs/navbar';
import { defineProps, onMounted, shallowRef } from 'vue'

const isLoggedIn = shallowRef(false);
const props = defineProps({
  theme: { type: String, required: true },
})

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
</style>
