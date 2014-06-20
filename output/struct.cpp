#include"struct.cpp"
void aStruct::parse(const char* name, const TiXmlElement& root){
	::parse(a, "a",root);
	::parse(b, "b",root);
	::parse(anInnerInstance, "anInnerInstance",root);
	::parse(v, "v",root);
	::parse(v2, "v2",root);
}
void aStruct::anInner::parse(const char* name, const TiXmlElement& root){
	::parse(aDouble, "aDouble",root);
}
