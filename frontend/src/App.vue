<template>
  <v-app :theme="theme">
    <TopBar :theme="theme" @toggle-theme="toggleTheme" />
    <v-main>
      <RouterView />
    </v-main>
    <AppFooter />
    <SpeedDial />
  </v-app>
</template>

<script setup>
import AppFooter from '@/components/AppFooter.vue'
import TopBar from '@/components/TopBar.vue'
import SpeedDial from '@/components/navbar/SpeedDial.vue';
import { ref, provide, onMounted } from 'vue'
import { RouterView } from 'vue-router'

const theme = ref(window.matchMedia('(prefers-color-scheme: dark)') ? 'dark' : 'light')

function toggleTheme() {
  theme.value = theme.value === 'light' ? 'dark' : 'light'
  localStorage.setItem('theme', theme.value)
}

onMounted(() => {
  const savedTheme = localStorage.getItem('theme')
  if (savedTheme) {
    theme.value = savedTheme
  }
})

provide('theme', {
  current: theme,
  toggle: toggleTheme
})
</script>
