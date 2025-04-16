<template>
  <router-link to="/" class="d-flex align-center reset-style">
    <img src="/logo_dark.webp" alt="Logo" class="logo" v-if="theme === 'light'" />
    <img src="/logo_light.webp" alt="Logo" class="logo" v-else />
    <span class="ml-2"><b>ManaMetrics</b></span>
  </router-link>
</template>

<script lang="ts" setup>
import { inject } from 'vue'

const { current: theme } = inject('theme') as { current: string };
</script>

<style lang="scss" scoped>
img {
  height: 100%;
  width: 1em;
}
a.reset-style {
  color: inherit;
  text-decoration: none;
}
</style>
