struct aStruct 
{
    int a; //这是一个注释
    int b;/*另外一个注释*/
    struct anInner
    {
        double aDouble;
    };
    anInner anInnerInstance;
    std::vector<int> v;
    std::vector<map<int, double> > v2;
};