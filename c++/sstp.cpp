class sstp {
        static int instance;
    public:
        void sftp(const& char* str) = 0;
};

class connect:public sstp {
    public:
    void sftp(char* str) {
        if(instance <= 10) {
            instance++;

        }
    }
}
