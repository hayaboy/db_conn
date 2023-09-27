package sec01.ex01;

import java.sql.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//VO 이것은 VO

@Data  //@Data 어노테이션은 @Getter @Setter @ToString 을 다 대체
@NoArgsConstructor
@AllArgsConstructor
public class MemberVO {

	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date joinDate;
}
