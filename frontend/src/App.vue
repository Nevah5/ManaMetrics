<template>
  <v-app :theme="theme">
    <v-app-bar app>
      <v-toolbar-title>MTG Stats</v-toolbar-title>
      <v-spacer></v-spacer>
    </v-app-bar>
    <v-navigation-drawer expand-on-hover rail>
      <v-list>
        <v-list-item
          prepend-avatar="https://randomuser.me/api/portraits/women/85.jpg"
          subtitle="sandra_a88@gmailcom"
          title="Sandra Adams"
        ></v-list-item>
      </v-list>

      <v-divider></v-divider>

      <v-list density="compact" nav>
        <v-list-item prepend-icon="mdi-folder" title="My Files" value="myfiles"></v-list-item>
        <v-list-item
          prepend-icon="mdi-account-multiple"
          title="Shared with me"
          value="shared"
        ></v-list-item>
        <v-list-item prepend-icon="mdi-star" title="Starred" value="starred"></v-list-item>
      </v-list>
      <v-divider></v-divider>
      <v-list density="compact">
        <v-list-item prepend-icon="mdi-star" title="Toggle Theme"></v-list-item>
      </v-list>
    </v-navigation-drawer>

    <RouterView />
  </v-app>
</template>

<script setup>
import { shallowRef } from 'vue'
import { RouterView } from 'vue-router'
const order = shallowRef(0)

const theme = shallowRef('light')

function toggleTheme() {
  theme.value = theme.value === 'light' ? 'dark' : 'light'
}
</script>
