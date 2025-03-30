<template>
  <v-card min-width="300">
    <v-list>
      <v-list-item prepend-icon="mdi-login" to="/login" @click="$emit('close')">Login</v-list-item>
      <v-list-item prepend-icon="mdi-account-plus" to="/register" @click="$emit('close')">Register</v-list-item>

      <v-divider></v-divider>

      <v-list-item
        @click="toggleTheme"
        :prepend-icon="theme === 'dark' ? 'mdi-white-balance-sunny' : 'mdi-weather-night'"
      >
        {{ theme === 'dark' ? 'Disable' : "Enable" }} dark mode
      </v-list-item>
    </v-list>
  </v-card>
</template>

<script lang="ts" setup>
import { defineProps, inject } from 'vue';

const { current: theme, toggle: toggleTheme } = inject('theme') as { current: string, toggle: () => void };

const props = defineProps({
  menu: {
    type: Boolean,
    default: false,
  },
});
</script>