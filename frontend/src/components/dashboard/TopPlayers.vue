<template>
  <div class="d-flex flex-column mb-8">
    <h2 class="mb-2 text-center">
      Top Players
      <v-chip size="small" color="green" append-icon="mdi-creation-outline">new</v-chip>
    </h2>
    <div class="ga-4 leaderboard">
      <v-card class="pb-4" color="blue-grey-lighten-1" href="/player/player2">
        <v-card-title class="d-flex flex-column align-center pa-8">
          <v-avatar color="info" size="80"></v-avatar>
          @player2
        </v-card-title>
        <v-card-subtitle class="text-h4">45% <span class="text-h6">winrate</span></v-card-subtitle>
        <v-card-subtitle class="text-h4">1423 <span class="text-h6">total games</span></v-card-subtitle>
        <v-card-subtitle class="text-h4">53 <span class="text-h6">games played</span></v-card-subtitle>
        <v-card-subtitle class="text-h4">43 <span class="text-h6">decks</span></v-card-subtitle>
      </v-card>
      <v-card class="pb-4" color="amber" href="/player/player1">
        <v-card-title class="d-flex flex-column align-center pa-8">
          <v-avatar color="info" size="80"></v-avatar>
          @player1
        </v-card-title>
        <v-card-subtitle class="text-h4">45% <span class="text-h6">winrate</span></v-card-subtitle>
        <v-card-subtitle class="text-h4">1423 <span class="text-h6">total games</span></v-card-subtitle>
        <v-card-subtitle class="text-h4">53 <span class="text-h6">games played</span></v-card-subtitle>
        <v-card-subtitle class="text-h4">43 <span class="text-h6">decks</span></v-card-subtitle>
      </v-card>
      <v-card class="pb-4" color="brown-lighten-1" href="/player/player3">
        <v-card-title class="d-flex flex-column align-center pa-8">
          <v-avatar color="info" size="80"></v-avatar>
          @player3
        </v-card-title>
        <v-card-subtitle class="text-h4">45% <span class="text-h6">winrate</span></v-card-subtitle>
        <v-card-subtitle class="text-h4">1423 <span class="text-h6">total games</span></v-card-subtitle>
        <v-card-subtitle class="text-h4">53 <span class="text-h6">games played</span></v-card-subtitle>
        <v-card-subtitle class="text-h4">43 <span class="text-h6">decks</span></v-card-subtitle>
      </v-card>
    </div>
    <p class="text-center mt-3">The players listed above and below are only from all of your groups</p>
    <v-data-table
      class="mt-4"
      :headers="headers"
      :items="players"
    ></v-data-table>
    <v-btn class="mt-2" color="blue-lighten-3" to="/user/@me/players">View all players from your groups</v-btn>
  </div>
</template>

<script setup lang="ts">
const headers = [
  {
    key: 'place',
    title: '#',
  },
  { key: 'player', title: 'Player', sortable: false },
  { key: 'winrate', title: 'Winrate %' },
  { key: 'games', title: 'Total Games' },
  { key: 'played', title: 'Games Played' },
  { key: 'decks', title: 'Amount Decks' },
]

const players = [
  { place: 4, player: '@player4', winrate: 47, games: 1500, played: 60, decks: 45 },
  { place: 5, player: '@player5', winrate: 44, games: 1400, played: 55, decks: 40 },
  { place: 6, player: '@player6', winrate: 46, games: 1450, played: 58, decks: 42 },
  { place: 7, player: '@player7', winrate: 43, games: 1350, played: 52, decks: 38 },
  { place: 8, player: '@player8', winrate: 48, games: 1550, played: 63, decks: 46 },
  { place: 9, player: '@player9', winrate: 42, games: 1300, played: 50, decks: 36 },
  { place: 10, player: '@player10', winrate: 45, games: 1420, played: 54, decks: 39 },
]
</script>

<style lang="scss" scoped>
.leaderboard {
  display: flex;
  justify-content: center;
  align-items: flex-end;

  .v-card {
    width: 30vw;

    &:nth-child(1) .v-card-title {
      margin-top: 20px;
      margin-bottom: 20px;
    }
    &:nth-child(2) .v-card-title {
      margin-top: 30px;
      margin-bottom: 50px;
    }
    &:nth-child(3) .v-card-title {
      margin-top: 0;
      margin-bottom: 0;
    }
  }
}
</style>