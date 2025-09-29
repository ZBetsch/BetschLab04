-- V3__create_profiles.sql
-- Creates the profiles table with a one-to-one primary-key relationship to users
CREATE TABLE IF NOT EXISTS profiles (
  id BIGINT PRIMARY KEY, -- also FK to users.id
  bio TEXT,
  phone_number VARCHAR(15),
  date_of_birth DATE,
  loyality_points INT UNSIGNED DEFAULT 0,
  CONSTRAINT fk_profiles_user FOREIGN KEY (id) REFERENCES users(id) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
