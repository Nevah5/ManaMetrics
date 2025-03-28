<template>
  <v-container class="fill-height" fluid>
    <v-row align="center" justify="center">
      <v-col cols="12" sm="8" md="6" lg="4">
        <v-card class="elevation-12 rounded-lg">
          <v-card-title class="text-center pt-6">
            <h1 class="text-h4 font-weight-bold primary--text">MTG Stats</h1>
            <p class="text-subtitle-1 mt-2">Register a new account</p>
          </v-card-title>
          <v-card-text>
            <v-form ref="form" v-model="valid" lazy-validation @submit.prevent="register">
              <v-text-field
                v-model="username"
                :rules="usernameRules"
                label="Username"
                prepend-inner-icon="mdi-account"
                required
                variant="outlined"
                class="mb-4"
              ></v-text-field>
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
                v-model="confirmEmail"
                :rules="confirmEmailRules"
                label="Repeat Email"
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
                class="mb-4"
              ></v-text-field>
              <v-text-field
                v-model="confirmPassword"
                :rules="confirmPasswordRules"
                label="Repeat Password"
                prepend-inner-icon="mdi-lock"
                :append-inner-icon="showPassword ? 'mdi-eye' : 'mdi-eye-off'"
                :type="showPassword ? 'text' : 'password'"
                required
                variant="outlined"
                @click:append-inner="showPassword = !showPassword"
              ></v-text-field>

              <v-btn
                color="primary"
                :loading="loading"
                block
                size="large"
                type="submit"
                :disabled="!valid"
                class="mb-2 mt-4"
              >
                Register
              </v-btn>

              <div class="text-center mt-4">
                <p>
                  Already have an account?
                  <router-link to="/login" class="text-decoration-none font-weight-bold">
                    Login
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
import { ref, computed } from 'vue';
import { useRouter } from 'vue-router';

const router = useRouter();
const valid = ref(false);
const loading = ref(false);
const showPassword = ref(false);
const username = ref('');
const email = ref('');
const confirmEmail = ref('');
const password = ref('');
const confirmPassword = ref('');

const usernameRules = [
  (v: string) => !!v || 'Username is required',
  (v: string) => v.length >= 3 || 'Username must be at least 3 characters',
  (v: string) => v.length <= 20 || 'Username must be at most 20 characters',
  (v: string) => /^[a-zA-Z0-9_]+$/.test(v) || 'Username can only contain letters, numbers, and underscores',
];

const emailRules = [
  (v: string) => !!v || 'Email is required',
  (v: string) => /.+@.+\..+/.test(v) || 'Email must be valid',
];

const confirmEmailRules = [
  (v: string) => !!v || 'Email confirmation is required',
  (v: string) => v === email.value || 'Emails do not match',
];

const passwordRules = [
  (v: string) => !!v || 'Password is required',
  (v: string) => v.length >= 8 || 'Password must be at least 8 characters',
];

const confirmPasswordRules = [
  (v: string) => !!v || 'Password confirmation is required',
  (v: string) => v === password.value || 'Passwords do not match',
];

const register = async () => {
  loading.value = true;
  
  try {
    // Replace this with your actual registration API call
    console.log('Registering with:', { 
      username: username.value, 
      email: email.value, 
      password: password.value 
    });
    
    // Simulate API delay
    await new Promise(resolve => setTimeout(resolve, 1000));
    
    // If registration successful
    router.push('/dashboard');
  } catch (error) {
    console.error('Registration failed:', error);
    // Handle registration error
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