INSERT INTO users (display_name, username, email, password_hash) VALUES
('Set', 'Setvizan', 'set@example.com', 'hehe!'),
('Never', 'Nevah5', 'nev@example.com', 'hehe!'),
('Ile', 'Bomber', 'ile@example.com', 'hehe!'),
('Watson', 'Lonely', 'wat@example.com', 'hehe!');

INSERT INTO decks (creator_id, name, link) VALUES
(1, 'Time sieve is a balanced card', 'http://example.com/pirates-hehe'),
(2, 'Tokens are goofy', 'http://example.com/koma-no-brain'),
(3, 'Splash!', 'http://example.com/yuriko-but-no-lands'),
(4, 'I hate proliferate', 'http://example.com/atraxa-lowlife');

INSERT INTO groups (name, owner_id, description) VALUES
('Mana Masters', 1, 'A group for competitive players.'),
('Casual Crew', 2, 'A group for casual games and fun.'),
('Deck Builders', 3, 'A group for sharing and testing new decks.');

INSERT INTO group_members (group_id, user_id, create_games) VALUES
(1, 1, TRUE),
(1, 2, FALSE),
(1, 3, FALSE),
(2, 2, TRUE),
(2, 4, FALSE),
(3, 3, TRUE),
(3, 1, FALSE);

INSERT INTO games (group_owner, created_by, location, notes, played_at) VALUES
(1, 1, 's05', 'Competitive match', '2025-04-16 17:30:00'),
(1, 1, 's05 but darker', 'Another competitive match', '2025-04-16 18:00:00'),
(2, 2, 'Table 2', 'Casual game with snacks', '2025-04-19 18:00:00'),
(3, 3, 'Online', 'Testing new decks', '2025-04-20 20:00:00');

INSERT INTO game_participants (user_id, deck_id, game_id, position, guest_name, comment) VALUES
(1, 1, 1, 1, NULL, 'Great game!'),
(2, 2, 1, 4, NULL, 'Close match.'),
(3, 3, 1, 3, NULL, 'Learned a lot.'),
(4, 4, 1, 2, NULL, 'Fun experience.'),
(1, 1, 2, 1, NULL, 'Another win!'),
(2, 2, 2, 4, NULL, 'Good effort.'),
(3, 3, 2, 3, NULL, 'Enjoyed the match.'),
(4, 4, 2, 2, NULL, 'Tough competition.'),
(3, 3, 4, 1, NULL, 'Deck performed well.'),
(NULL, NULL, 4, 2, 'GuestPlayer', 'Interesting strategies.');

INSERT INTO roles (role) VALUES
('Admin'),
('Standard');

INSERT INTO user_roles (user_id, role_id) VALUES
(1, 1),
(2, 2),
(3, 2),
(4, 2);