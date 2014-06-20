    #ifndef _STRUCT_CPP_
    #define _STRUCT_CPP_
    //struct aStruct : public IMsgBody
    //{
    //   int a[playerNum]; //这是一个注释
    //   int b;/*另外一个注释*/
    //   struct anInner
    //   {
    //       double aDouble;
    //   };
    //   anInner anInnerInstance;
    //   std:: vector<int> v;
    //   std::vector<map<int, double> > v2;
    //};

    class SomeResp : public IMsgBody
    {

    	int32_t Encode(uint8_t* buf, const uint32_t size, uint32_t& offset){		return 1;	}
    	int32_t Decode(uint8_t* buf, const uint32_t size, uint32_t& offset){
    		return 2;
    	}
    	int32_t Dump(uint8_t* buf, const uint32_t size, uint32_t& offset);

    	int32_t			nErrorCode;
    	int32_t			nRoleID;
    	int32_t			serverID;
    	HSSRoleGameInfo  stRoleGameInfo;
    	int32_t			bathOpenStage;
    	int32_t			nHotSpringCount;
    	HotSpringGeneralInfo stHotSpringGeneralInfo[enmMaxHotSpringCount];
        void parse(const char* name, const TiXmlElement& root);
    };
    #endif