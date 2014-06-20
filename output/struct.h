    #ifndef _STRUCT_CPP_
    #define _STRUCT_CPP_
    struct aStruct 
    {
        int a[playerNum]; //这是一个注释
        int b;/*另外一个注释*/
        struct anInner
        {
            double aDouble;
            void parse(const char* name, const TiXmlElement& root);
        };
        anInner anInnerInstance;
        std::vector<int> v;
        std::vector<map<int, double> > v2;
        void parse(const char* name, const TiXmlElement& root);
    };
    ##endif