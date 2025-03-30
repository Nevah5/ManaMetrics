interface NavbarItem {
  display: string;
  path?: string;
  icon: string;
  children?: NavbarItem[];
}

const items: NavbarItem[] = [
  {
    display: "Home",
    path: "/",
    icon: "mdi-home-outline",
  },
  {
    display: "Explore",
    path: "/explore",
    icon: "mdi-compass-outline",
  },
  {
    display: "Decks",
    path: "/decks",
    icon: "mdi-cards-outline",
  }
]

const personal: NavbarItem[] = [
  {
    display: "Groups",
    path: "/user/@me/groups",
    icon: "mdi-account-group-outline",
  },
  {
    display: "Stats",
    path: "/user/@me/stats",
    icon: "mdi-chart-box-outline",
  },
]

export {
  items,
  personal
}

export type {
  NavbarItem
}
