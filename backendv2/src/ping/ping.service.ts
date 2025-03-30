import { Injectable } from '@nestjs/common';

@Injectable()
export class PingService {
    getPong(): string {
        return 'pong!';
    }
}
