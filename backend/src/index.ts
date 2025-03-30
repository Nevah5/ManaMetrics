import express, { Express, Request, Response } from "express";
import dotenv from "dotenv";
import { pingRouter } from "./routes/pingRoute";

dotenv.config();

const app: Express = express();
const port = process.env.PORT || 3000;

app.get("/", (req: Request, res: Response) => {
  res.send("Hello World!");
});

app.use("/ping",pingRouter)

app.listen(port, () => {
  console.log(`[server]: Server is running at http://localhost:${port}`);
});