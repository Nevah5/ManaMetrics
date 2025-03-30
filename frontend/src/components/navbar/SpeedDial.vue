
<template>
  <div class="speed-dial d-md-none">
    <v-speed-dial
      v-model="isOpen"
      attach="body"
      :contained="true"
      location="top center"
      transition="fade-transition">
      <template v-slot:activator="{ props: activatorProps, isActive }">
        <v-fab
          v-bind="activatorProps"
          size="large"
          :icon="isActive ? 'mdi-close' : 'mdi-menu'"
          :color="theme === 'dark' ? 'indigo-lighten-5' : 'indigo-darken-3'"
        ></v-fab>
      </template>

        <v-btn v-for="item, i in personalReversed" :key="i" :icon="item.icon" @click="$router.push(item.path || '')"
            :color="theme === 'dark' ? 'indigo-lighten-5' : 'indigo-lighten-1'" />
        <v-btn v-for="item, i in itemsReversed" :key="i + personalReversed.length" :icon="item.icon" @click="$router.push(item.path || '')"
            :color="theme === 'dark' ? 'indigo-lighten-5' : 'indigo-lighten-1'" />
    </v-speed-dial>
  </div>
</template>

<script lang="ts" setup>
import { items, personal } from '@/configs/navbar';
import { shallowRef, onMounted, inject } from 'vue';

const { current: theme } = inject('theme') as { current: string };

const itemsReversed = [...items].reverse();
const personalReversed = [...personal].reverse();

const isOpen = shallowRef(false);
const isLoggedIn = shallowRef(true);

onMounted(() => {
  isLoggedIn.value = !!localStorage.getItem('is_login');
});
</script>

<style lang="scss" scoped>
.speed-dial {
  position: fixed;
  bottom: 20px;
  right: 20px;
  z-index: 1000;
}
</style>
