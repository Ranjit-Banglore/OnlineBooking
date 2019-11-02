DROP TABLE IF EXISTS ticket_details;
CREATE TABLE  ticket_details (
  id serial PRIMARY KEY,
  booking_date text NOT NULL,
  dest_station text NOT NULL,
  email text default NULL,
  passenger_name text NOT NULL,
  source_station text NOT NULL
) ;
