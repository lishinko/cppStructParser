#include"struct.cpp"
void SomeResp::parse(const char* name, const TiXmlElement& root){
	::parse(nErrorCode, "nErrorCode",root);
	::parse(nRoleID, "nRoleID",root);
	::parse(serverID, "serverID",root);
	::parse(stRoleGameInfo, "stRoleGameInfo",root);
	::parse(bathOpenStage, "bathOpenStage",root);
	::parse(nHotSpringCount, "nHotSpringCount",root);
	::parse(stHotSpringGeneralInfo, "stHotSpringGeneralInfo",root);
}
