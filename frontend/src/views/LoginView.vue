<template>
  <v-container class="fill-height" fluid>
    <v-row align="center" justify="center">
      <v-col cols="12" sm="8" md="6" lg="4">
        <v-card class="elevation-12 rounded-lg">
          <v-card-title class="text-center pt-6">
            <h1 class="text-h4 font-weight-bold primary--text">MTG Stats</h1>
            <p class="text-subtitle-1 mt-2">Sign in to your account</p>
          </v-card-title>
          <v-card-text>
            <v-form ref="form" v-model="valid" lazy-validation @submit.prevent="login">
              <v-text-field
                v-model="email"
                :rules="emailRules"
                label="Email"
                prepend-inner-icon="mdi-email"
                required
                variant="outlined"
                class="mb-4"
              ></v-text-field>

              <v-text-field
                v-model="password"
                :rules="passwordRules"
                label="Password"
                prepend-inner-icon="mdi-lock"
                :append-inner-icon="showPassword ? 'mdi-eye' : 'mdi-eye-off'"
                :type="showPassword ? 'text' : 'password'"
                required
                variant="outlined"
                @click:append-inner="showPassword = !showPassword"
              ></v-text-field>

              <div class="d-flex justify-space-between align-center mt-3 mb-5">
                <v-checkbox
                  v-model="rememberMe"
                  label="Remember me"
                  hide-details
                  class="mt-0"
                ></v-checkbox>
                <router-link to="/forgot-password" class="text-decoration-none">
                  Forgot password?
                </router-link>
              </div>

              <v-btn
                color="primary"
                :loading="loading"
                block
                size="large"
                type="submit"
                :disabled="!valid"
                class="mb-2"
              >
                Login
              </v-btn>

              <div class="text-center mt-4">
                <p>
                  Don't have an account?
                  <router-link to="/register" class="text-decoration-none font-weight-bold">
                    Register
                  </router-link>
                </p>
              </div>
            </v-form>
          </v-card-text>
        </v-card>
      </v-col>
    </v-row>
  </v-container>
</template>

<script lang="ts" setup>
import { ref } from 'vue';
import { useRouter } from 'vue-router';

const router = useRouter();
const valid = ref(false);
const loading = ref(false);
const showPassword = ref(false);
const email = ref('');
const password = ref('');
const rememberMe = ref(false);

const emailRules = [
  (v: string) => !!v || 'Email is required',
  (v: string) => /.+@.+\..+/.test(v) || 'Email must be valid',
];

const passwordRules = [
  (v: string) => !!v || 'Password is required',
];

const login = async () => {
  loading.value = true;
  
  try {
    // Replace this with your actual login API call
    // Example: await authService.login(email.value, password.value);
    console.log('Logging in with:', { email: email.value, password: password.value });
    
    // Simulate API delay
    await new Promise(resolve => setTimeout(resolve, 1000));
    
    // If login successful
    router.push('/dashboard');
  } catch (error) {
    console.error('Login failed:', error);
    // Handle login error
  } finally {
    loading.value = false;
  }
};
</script>

<style scoped>
.v-card {
  border-radius: 16px;
}
</style>