<template>
  <slot name="menu-items">
    <template v-for="i in props.items" :key="i.display">
      <router-link v-if="!i.children && i.path" :to="i.path">
        {{ i.display }}
      </router-link>

      <v-menu v-else>
        <template v-slot:activator="{ props }">
          <span v-bind="props">{{ i.display }}</span>
        </template>

        <v-card
          class="mx-auto"
          max-width="300"
        >
          <v-list>
            <v-list-item v-for="c in i.children" :key="c.path" :to="c.path">{{ c.display }}</v-list-item>
          </v-list>
        </v-card>
      </v-menu>
    </template>
  </slot>
</template>

<script lang="ts" setup>
import type { NavbarItem } from '@/configs/navbar';
import { defineProps } from 'vue';

const props = defineProps<{
  items: NavbarItem[];
}>();
</script>

<style lang="scss" scoped>
a {
  color: inherit;
  text-decoration: none;
}
</style>