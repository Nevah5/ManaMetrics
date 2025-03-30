FROM node:alpine3.20

WORKDIR /app

COPY . .

RUN npm install && npm run build

EXPOSE 3000

ENTRYPOINT ["npm", "run", "start"]
