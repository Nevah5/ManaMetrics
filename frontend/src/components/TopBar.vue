<template>
  <v-app-bar app>
    <div class="d-flex align-center ga-10 ml-5">
      <v-toolbar-title>MTG Stats</v-toolbar-title>

      <div class="d-flex align-center ga-3">
        <nav-button :items="items" />
        <v-divider class="mx-3" vertical></v-divider>
        <nav-button :items="personal" />
      </div>
    </div>

    <v-spacer></v-spacer>

    <v-btn
      :icon="theme === 'dark' ? 'mdi-white-balance-sunny' : 'mdi-weather-night'"
      :color="theme === 'dark' ? 'white' : 'black'"
      class="ma-2"
      @click="$emit('toggleTheme')"
    ></v-btn>
  </v-app-bar>
</template>

<script setup>
import NavButton from './buttons/NavButton.vue';
import { items, personal } from '@/configs/navbar';
import { defineProps } from 'vue'

const props = defineProps({
  theme: { type: String, required: true },
})
</script>
