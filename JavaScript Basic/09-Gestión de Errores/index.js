const winston = require('winston');

const logger = winston.createLogger({
    level: 'error',
    format: winston.format.json(),
    defaultMeta: { service: 'user-service' },
    transports: [
        new winston.transports.File({ filename: 'error.log', level: 'error' }),
    ],
});

function error (string) {
    throw new Error("ERROR")
}

try {
    error()
} catch(e){
    logger.log("ERROR", e.toString())
}