<template>
  <div class="d-flex flex-column mb-4">
    <h2 class="mb-2">
      ✨ Featured Statistics ✨
      <v-chip size="small" color="green" append-icon="mdi-creation-outline">new</v-chip>
    </h2>
    <div class="d-flex flex-wrap ga-4">
      <v-card class="pb-4">
        <v-card-title>
          Total Players
        </v-card-title>
        <v-card-subtitle class="text-h4">1,234</v-card-subtitle>
      </v-card>
      <v-card class="pb-4">
        <v-card-title>
          <v-icon icon="mdi-gamepad-variant-outline" size="small" />
          Total Games
        </v-card-title>
        <v-card-subtitle class="text-h4">4,321</v-card-subtitle>
      </v-card>
      <v-card class="pb-4">
        <v-card-title>
          <v-icon icon="mdi-gamepad-variant-outline" size="small" />
          Total Games
          <v-chip size="small" color="blue" append-icon="mdi-clock-time-eight-outline">last 30 days</v-chip>
        </v-card-title>
        <v-card-subtitle class="text-h4">1,234</v-card-subtitle>
      </v-card>
      <v-card class="pb-4" href="/decks/featured">
        <v-card-title>
          <v-icon icon="mdi-cards-outline" size="small" />
          Top Deck
        </v-card-title>
        <v-card-subtitle class="text-h4">Koma Serpent V2</v-card-subtitle>
      </v-card>
      <v-card class="pb-4" href="decks/newest">
        <v-card-title>
          <v-icon icon="mdi-cards-outline" size="small" />
          Newest Deck
        </v-card-title>
        <v-card-subtitle class="text-h4">Koma Serpent V2</v-card-subtitle>
      </v-card>
      <v-card class="pb-4" href="decks/newest">
        <v-card-title>
          <v-icon icon="mdi-cards-outline" size="small" />
          Top Player
          <v-chip size="small" color="blue" append-icon="mdi-clock-time-eight-outline">all time</v-chip>
        </v-card-title>
        <v-card-subtitle class="text-h4">@nevah5</v-card-subtitle>
      </v-card>
      <v-card class="pb-4" href="decks/newest">
        <v-card-title>
          <v-icon icon="mdi-cards-outline" size="small" />
          Top Player
          <v-chip size="small" color="blue" append-icon="mdi-clock-time-eight-outline">last 30 days</v-chip>
        </v-card-title>
        <v-card-subtitle class="text-h4">@nevah5</v-card-subtitle>
      </v-card>
      <v-card class="pb-4" href="decks/newest">
        <v-card-title>
          <v-icon icon="mdi-cards-outline" size="small" />
          Newest Player
        </v-card-title>
        <v-card-subtitle class="text-h4">@nevah5</v-card-subtitle>
      </v-card>
    </div>
  </div>
</template>

<style lang="scss" scoped>
.v-card {
  min-width: 300px;
  width: 23vw;
}
</style>