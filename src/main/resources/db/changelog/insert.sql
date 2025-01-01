INSERT INTO word (word)
VALUES ('asdf'),
       ('qwerty'),
       ('random') on conflict do nothing;