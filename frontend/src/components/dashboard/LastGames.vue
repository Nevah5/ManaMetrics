<template>
  <div class="d-flex flex-column mb-8">
    <h2 class="mb-2 text-center">
      Last Games
      <v-chip size="small" color="green" append-icon="mdi-creation-outline">new</v-chip>
    </h2>
    <v-table>
      <thead>
        <tr>
          <th>
            ID
          </th>
          <th>
            Winner
          </th>
          <th>
            Winner Deck
          </th>
          <th>
            Played at
          </th>
          <th>
            Notes
          </th>
        </tr>
      </thead>
      <tbody>
        <tr
          v-for="game in games"
          :key="game.id"
        >
          <td><router-link :to="'/games/' + game.id">{{ game.id }}</router-link></td>
          <td>{{ game.winner }}</td>
          <td>{{ game.deck }}</td>
          <td>{{ game.playedAt }}</td>
          <td>{{ game.notes }}</td>
        </tr>
      </tbody>
    </v-table>
    <router-link class="text-center mt-4" to="/user/@me/games">View all games played</router-link>
  </div>
</template>

<script setup lang="ts">
const games = [
  { id: 7823155, winner: '@nevah5', deck: 'Koma Serpent V2', playedAt: "2025-01-05", notes: 'example note' },
  { id: 5823410, winner: '@nevah5', deck: 'Koma Serpent V2', playedAt: "2025-02-23", notes: 'example note' },
  { id: 5137132, winner: '@nevah5', deck: 'Koma Serpent V2', playedAt: "2025-03-05", notes: 'example note' },
  { id: 5132513, winner: '@nevah5', deck: 'Koma Serpent V2', playedAt: "2025-03-13", notes: 'example note' },
  { id: 5132515, winner: '@nevah5', deck: 'Koma Serpent V2', playedAt: "2025-03-29", notes: 'example note' },
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