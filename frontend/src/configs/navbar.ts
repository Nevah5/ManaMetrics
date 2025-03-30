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
    "path": "/explore"
  },
  {
    "display": "Decks",
    "path": "/decks",
  }
]

const personal: NavbarItem[] = [
  {
    "display": "Groups",
    "path": "/user/@me/groups",
  },
  {
    "display": "Stats",
    "path": "/user/@me/stats",
  },
]

export {
  items,
  personal
}

export type {
  NavbarItem
}
