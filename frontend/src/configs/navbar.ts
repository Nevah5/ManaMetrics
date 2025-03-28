interface NavbarItem {
  display: string;
  path?: string;
  children?: NavbarItem[];
}

const navbarItems: NavbarItem[] = [
  {
    "display": "Home",
    "path": "/",
  },
  {
    "display": "Explore",
    "children": [
      {
        "display": "Users",
        "path": "/users",
      },
      {
        "display": "Leaderboard",
        "path": "/users/leaderboard",
      },
      {
        "display": "Most played",
        "path": "/explore/most-played",
      }
    ]
  },
  {
    "display": "Decks",
    "path": "/decks",
  }
]

export default navbarItems
