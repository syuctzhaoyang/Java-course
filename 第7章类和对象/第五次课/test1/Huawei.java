package sim2;

public class Huawei {
	Sim sim;
	private String brandname;
	
	public Huawei(){
		brandname = "华为";
	}
	
	public String getBrandname() {
		return "品牌：" + brandname;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}
	public String getcropname(){
		if(sim == null){
			return "没插sim卡，无法确定所属公司";
		}else{
			return "所属公司通信公司：" + sim.getCropName();
		}
	}
	public String getphonenumber(){
		if(sim == null){
			return "没插sim卡";
		}else if(sim.getNumber() == null){
			return "没写号码新的sim卡";
		}else{
			return "电话号码为：" + sim.getNumber();
		}
			
	}
}
