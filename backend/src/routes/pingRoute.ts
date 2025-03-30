import express from "express";

export const pingRouter = express.Router()

pingRouter.get('/', (req, res) => {
    res.send('Pong!')
})

