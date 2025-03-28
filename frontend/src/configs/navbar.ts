interface NavbarItem {
  display: string;
  path?: string;
  children?: NavbarItem[];
}

const items: NavbarItem[] = [
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

const personal: NavbarItem[] = [
  {
    "display": "Your Games",
    "path": "/user/@me/games",
  },
  {
    "display": "Groups",
    "path": "/user/@me/groups",
  }
]

export {
  items,
  personal
}

export type {
  NavbarItem
}
