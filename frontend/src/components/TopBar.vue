<template>
  <v-app-bar app>
    <v-toolbar-title>MTG Stats</v-toolbar-title>
  </v-app-bar>
</template>

<script setup>
import { defineProps } from 'vue'

const props = defineProps({
  theme: { type: String, required: true },
})
</script>
