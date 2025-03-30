
<template>
  <div class="d-flex speed-dial">
    <v-speed-dial attach="body" :contained="true" location="top center" transition="fade-transition" class="speed-dial">
      <template v-slot:activator="{ props: activatorProps }">
        <v-fab
          v-bind="activatorProps"
          size="large"
          icon="mdi-menu"
        ></v-fab>
      </template>

      <v-btn v-for="item, i in personalReversed" :key="i" :icon="item.icon" :to="item.path" />
      <v-btn v-for="item, i in itemsReversed" :key="i" :icon="item.icon" :to="item.path" />
    </v-speed-dial>
  </div>
</template>

<script lang="ts" setup>
import { items, personal } from '@/configs/navbar';
import { shallowRef, onMounted } from 'vue';

const itemsReversed = items.reverse();
const personalReversed = personal.reverse();

const isLoggedIn = shallowRef(true);

onMounted(() => {
  const isLogin = localStorage.getItem('is_login');
  if (isLogin) {
    isLoggedIn.value = true;
  } else {
    isLoggedIn.value = false;
  }
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
