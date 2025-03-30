<template>
  <div class="d-flex flex-column mb-8">
    <h2 class="mb-2 text-center">
      Top Decks
      <v-chip size="small" color="green" append-icon="mdi-creation-outline">new</v-chip>
    </h2>
    <v-data-table
      class="mt-4"
      :headers="headers"
      :items="decks"
    ></v-data-table>
  </div>
</template>

<script setup lang="ts">
const headers = [
  { key: 'rank', title: '#' },
  { key: 'name', title: 'Deck Name', sortable: false },
  { key: 'archetype', title: 'Archetype', sortable: false },
  { key: 'winrate', title: 'Winrate %' },
  { key: 'games', title: 'Games Played' },
  { key: 'creator', title: 'Creator', sortable: false },
]

const decks = [
  { rank: 1, name: 'Goblin Rush', archetype: 'Aggro', winrate: 55, games: 2100, creator: '@player' },
  { rank: 2, name: 'Mystic Control', archetype: 'Control', winrate: 53, games: 2050, creator: '@player' },
  { rank: 3, name: 'Big Green Ramp', archetype: 'Ramp', winrate: 50, games: 2000, creator: '@player' },
  { rank: 4, name: 'Black Mill', archetype: 'Mill', winrate: 48, games: 1950, creator: '@player' },
  { rank: 5, name: 'White Weenies', archetype: 'Aggro', winrate: 52, games: 1900, creator: '@player' },
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