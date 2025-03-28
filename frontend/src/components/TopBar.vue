<template>
  <v-app-bar app>
    <v-toolbar-title>MTG Stats</v-toolbar-title>
    <p v-for="i in navItems" :key="i.display">{{ i.display }}</p>
    <v-divider class="mx-3" vertical inset></v-divider>
    <p>Your Games</p>
    <p>Groups</p>
    <v-spacer></v-spacer>
  </v-app-bar>
</template>

<script setup>
import navItems from '@/configs/navbar';
import { defineProps } from 'vue'

const props = defineProps({
  theme: { type: String, required: true },
})
</script>
