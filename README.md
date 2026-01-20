# Hotel Booking Application
### Overview
This project is a Hotel Booking Application developed using ReactJS for the front-end and Spring Boot for the back-end. The application provides two roles: Admin and User. Each role has specific functionalities as described below.
## Features
### Admin Role
#### Admins have the following permissions:
```
View all bookings
Cancel any booking
Add new rooms
Update room details
Delete rooms
```
### User Role
#### Users have the following permissions:
```
Book a room
View their bookings
```
### Technologies Used
Front-end: ReactJS, Redux, Axios
Back-end: Spring Boot, Spring Security, JPA, Hibernate
Database: MySQL
### Installation

Node.js
npm or yarn
Java (JDK 11 or above)
MySQL
#### Front-end Setup
npm install
```
npm start
```
npm run dev
### Usage
Register as a user or log in if you already have an account.
Admins can access the admin dashboard to manage rooms and bookings.
Users can browse available rooms and make bookings.
### API Endpoints
##### Admin Endpoints
GET /api/admin/bookings - View all bookings
DELETE /api/admin/bookings/{bookingId} - Cancel a booking
POST /api/admin/rooms - Add a new room
PUT /api/admin/rooms/{roomId} - Update room details
DELETE /api/admin/rooms/{roomId} - Delete a room
##### User Endpoints
POST /api/user/bookings - Book a room
GET /api/user/bookings - View user bookings
