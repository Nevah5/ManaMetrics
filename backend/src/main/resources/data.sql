INSERT INTO users (display_name, username, email, password_hash) VALUES
('Set','Setvizan', 'set@example.com', 'hehe!'),
('Never','Nevah5', 'nev@example.com', 'hehe!'),
('Ile','Bomber', 'ile@example.com', 'hehe!'),
('Watson','Lonely', 'wat@example.com', 'hehe!');

INSERT INTO decks (user_id, name, link) VALUES
(1, 'Time sieve is a balanced card', 'http://example.com/pirates-hehe'),
(2, 'Tokens are goofy', 'http://example.com/koma-no-brain'),
(3, 'Splash!', 'http://example.com/yuriko-but-no-lands'),
(4, 'I hate proliferate', 'http://example.com/atraxa-lowlife');

INSERT INTO games (played_at, location, winner_id) VALUES
('2025-04-16 17:30:00', 's05', 1),
('2025-04-16 18:00:00', 's05 but darker', 1);

INSERT INTO participants (user_id, game_id, deck_id, position) VALUES
(1, 1, 1, 1),
(2, 1, 2, 4),
(3, 1, 3, 3),
(4, 1, 4, 2),
(1, 2, 1, 1),
(2, 2, 2, 4),
(3, 2, 3, 3),
(4, 2, 4, 2);

INSERT INTO roles (role) VALUES
('Admin'),
('Standard');

INSERT INTO user_roles (user_id, role_id) VALUES
(1, 1),
(2, 2),
(3, 2),
(4, 2);