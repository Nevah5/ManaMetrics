FROM node:alpine3.20 AS build

WORKDIR /app

COPY . .

RUN npm install && npm run windup

EXPOSE 3000
