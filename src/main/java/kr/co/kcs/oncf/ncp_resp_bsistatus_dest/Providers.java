
package kr.co.kcs.oncf.ncp_resp_bsistatus_dest;

import java.io.Serializable;
import kr.co.kcs.oncf.ncp_resp_bsistatus_dest.providers.Bsi_Attr_DataMarker;
import kr.co.kcs.oncf.ncp_resp_bsistatus_dest.providers.Bsi_Provider_IdMarker;
import kr.co.kcs.oncf.ncp_resp_bsistatus_dest.providers.Bsi_Service_NameMarker;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlField;
import com.hpe.nonstop.ddl2bean.commons.annotations.DdlGroup;
import com.hpe.nonstop.ddl2bean.commons.annotations.ReturnType;

@DdlGroup(Version = "2.0", QualName = "providers", ElementSize = 362, LocalName = "providers")
public class Providers
    implements Serializable
{

    private String prov_Symname;
    private String notify_Service;
    private int vsn;
    private Bsi_Provider_IdMarker bsi_Provider_Id;
    private String bsi_Application_Id;
    private Bsi_Service_NameMarker bsi_Service_Name;
    private int bsi_Min_Vsn;
    private int bsi_Max_Vsn;
    private short bsi_Attr_Len;
    private Bsi_Attr_DataMarker bsi_Attr_Data;

    @DdlField(Version = "2.0", QualName = "prov-symname", ObjectClass = 1, Level = 2, Structure = 0, Offset = 18, ElementSize = 16, IdentifierElement = 4)
    public String getProv_Symname() {
        return prov_Symname;
    }

    public void setProv_Symname(String prov_SymnameParam) {
        this.prov_Symname = prov_SymnameParam;
    }

    @DdlField(Version = "2.0", QualName = "notify-service", ObjectClass = 1, Level = 2, Structure = 0, Offset = 34, ElementSize = 16, IdentifierElement = 5)
    public String getNotify_Service() {
        return notify_Service;
    }

    public void setNotify_Service(String notify_ServiceParam) {
        this.notify_Service = notify_ServiceParam;
    }

    @DdlField(Version = "2.0", QualName = "vsn", ObjectClass = 1, Level = 2, Structure = 4, Offset = 50, ElementSize = 4, IdentifierElement = 6)
    public int getVsn() {
        return vsn;
    }

    public void setVsn(int vsnParam) {
        this.vsn = vsnParam;
    }

    @DdlField(Version = "2.0", QualName = "bsi-provider-id", ObjectClass = 1, Level = 2, Structure = 0, Offset = 54, ElementSize = 100, IdentifierElement = 7)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_bsistatus_dest.providers.Bsi_Provider_Id")
    public Bsi_Provider_IdMarker getBsi_Provider_Id() {
        return bsi_Provider_Id;
    }

    public void setBsi_Provider_Id(Bsi_Provider_IdMarker bsi_Provider_IdParam) {
        this.bsi_Provider_Id = bsi_Provider_IdParam;
    }

    @DdlField(Version = "2.0", QualName = "bsi-application-id", ObjectClass = 1, Level = 2, Structure = 0, Offset = 154, ElementSize = 36, IdentifierElement = 11)
    public String getBsi_Application_Id() {
        return bsi_Application_Id;
    }

    public void setBsi_Application_Id(String bsi_Application_IdParam) {
        this.bsi_Application_Id = bsi_Application_IdParam;
    }

    @DdlField(Version = "2.0", QualName = "bsi-service-name", ObjectClass = 1, Level = 2, Structure = 0, Offset = 190, ElementSize = 80, IdentifierElement = 12)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_bsistatus_dest.providers.Bsi_Service_Name")
    public Bsi_Service_NameMarker getBsi_Service_Name() {
        return bsi_Service_Name;
    }

    public void setBsi_Service_Name(Bsi_Service_NameMarker bsi_Service_NameParam) {
        this.bsi_Service_Name = bsi_Service_NameParam;
    }

    @DdlField(Version = "2.0", QualName = "bsi-min-vsn", ObjectClass = 1, Level = 2, Structure = 4, Offset = 270, ElementSize = 4, IdentifierElement = 16)
    public int getBsi_Min_Vsn() {
        return bsi_Min_Vsn;
    }

    public void setBsi_Min_Vsn(int bsi_Min_VsnParam) {
        this.bsi_Min_Vsn = bsi_Min_VsnParam;
    }

    @DdlField(Version = "2.0", QualName = "bsi-max-vsn", ObjectClass = 1, Level = 2, Structure = 4, Offset = 274, ElementSize = 4, IdentifierElement = 17)
    public int getBsi_Max_Vsn() {
        return bsi_Max_Vsn;
    }

    public void setBsi_Max_Vsn(int bsi_Max_VsnParam) {
        this.bsi_Max_Vsn = bsi_Max_VsnParam;
    }

    @DdlField(Version = "2.0", QualName = "bsi-attr-len", ObjectClass = 1, Level = 2, Structure = 2, Offset = 278, ElementSize = 2, IdentifierElement = 18)
    public short getBsi_Attr_Len() {
        return bsi_Attr_Len;
    }

    public void setBsi_Attr_Len(short bsi_Attr_LenParam) {
        this.bsi_Attr_Len = bsi_Attr_LenParam;
    }

    @DdlField(Version = "2.0", QualName = "bsi-attr-data", ObjectClass = 1, Level = 2, Structure = 0, Offset = 280, ElementSize = 100, IdentifierElement = 19)
    @ReturnType("kr.co.kcs.oncf.ncp_resp_bsistatus_dest.providers.Bsi_Attr_Data")
    public Bsi_Attr_DataMarker getBsi_Attr_Data() {
        return bsi_Attr_Data;
    }

    public void setBsi_Attr_Data(Bsi_Attr_DataMarker bsi_Attr_DataParam) {
        this.bsi_Attr_Data = bsi_Attr_DataParam;
    }

}
