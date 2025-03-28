<template>
  <v-app :theme="theme">
    <TopBar :theme="theme" @toggle-theme="toggleTheme" />
    <v-main>
      <RouterView />
    </v-main>
    <AppFooter />
  </v-app>
</template>

<script setup>
import AppFooter from './components/AppFooter.vue'
import TopBar from '@/components/TopBar.vue'
import { shallowRef } from 'vue'
import { RouterView } from 'vue-router'

const theme = shallowRef(window.matchMedia('(prefers-color-scheme: dark)') ? 'dark' : 'light')

function toggleTheme() {
  theme.value = theme.value === 'light' ? 'dark' : 'light'
}
</script>
