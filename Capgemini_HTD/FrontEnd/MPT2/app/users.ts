export class User {
    constructor(
        public userId: number,
        public id: string,
        public body: string,
        public title: string,
        public pk ?: string
    ) {}
}
