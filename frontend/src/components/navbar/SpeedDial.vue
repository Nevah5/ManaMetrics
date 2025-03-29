
<template>
  <div class="text-center speed-dial">
    <v-menu
      :close-on-content-click="true"
      location="top"
    >
      <template v-slot:activator="{ props }">
        <v-btn
          density="compact"
          icon="mdi-home"
          size="x-large"
          v-bind="props" />
      </template>

      <v-list class="speed-dial-content mb-4">
        <template v-for="item, i in items" :key="i">
          <v-list-item
            v-if="!item.children"
            :title="item.display"
            :to="item.path"
          ></v-list-item>
          <v-list-group v-else :value="item.display">
            <template v-slot:activator="{ props }">
              <v-list-item
                v-bind="props"
                :title="item.display"
              ></v-list-item>
            </template>

            <v-list-item
              v-for="child, ci in item.children" :key="ci"
              :title="child.display"
              :to="child.path"
            ></v-list-item>
          </v-list-group>
        </template>
        <v-divider class="mx-3" vertical v-if="isLoggedIn"></v-divider>
        <template v-for="item, i in personal" :key="i" v-if="isLoggedIn">
          <v-list-item
            v-if="!item.children"
            :title="item.display"
            :to="item.path"
          ></v-list-item>
          <v-list-group v-else :value="item.display">
            <template v-slot:activator="{ props }">
              <v-list-item
                v-bind="props"
                :title="item.display"
              ></v-list-item>
            </template>

            <v-list-item
              v-for="child, ci in item.children" :key="ci"
              :title="child.display"
              :to="child.path"
            ></v-list-item>
          </v-list-group>
        </template>
      </v-list>
    </v-menu>
  </div>
</template>

<script lang="ts" setup>
import { items, personal } from '@/configs/navbar';
import { shallowRef, onMounted } from 'vue';

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

.speed-dial-content {
  width: 40vw;
  min-width: 400px;
}
</style>