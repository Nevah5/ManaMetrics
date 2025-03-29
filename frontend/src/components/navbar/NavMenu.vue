<template>
  <v-card min-width="300">
    <v-list>
      <v-list-item prepend-icon="mdi-login" to="/login" @click="$emit('close')">Login</v-list-item>
      <v-list-item prepend-icon="mdi-account-plus" to="/register" @click="$emit('close')">Register</v-list-item>

      <v-divider></v-divider>

      <v-list-item
        @click="$emit('toggleTheme')"
        :prepend-icon="props.theme === 'dark' ? 'mdi-white-balance-sunny' : 'mdi-weather-night'"
      >
        {{ props.theme === 'dark' ? 'Disable' : "Enable" }} dark mode
      </v-list-item>
    </v-list>
  </v-card>
</template>

<script lang="ts" setup>
import { defineProps } from 'vue';

const props = defineProps({
  menu: {
    type: Boolean,
    default: false,
  },
  theme: {
    type: String,
    required: true,
  },
});
</script>