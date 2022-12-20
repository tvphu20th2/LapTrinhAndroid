package phurua.it.gioithieudiadiemdulichvn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        ArrayList<DiaDiem> arrayList;
        AdapterDiaDiem adapterDiaDiem ;

        listView = findViewById(R.id.lvDiaDiem);
        arrayList = new ArrayList<>();
        arrayList.add(new DiaDiem("Đà Lạt",R.drawable.da_lat,"Ẩn mình trong Tây Nguyên, Đà Lạt đóng vai trò là người anh em mát mẻ hơn so với các điểm đến bên bờ biển của Việt Nam. Nổi tiếng với nét duyên dáng miền quê, Đà Lạt thu hút các cặp đôi, những người tìm kiếm sự chăm sóc sức khỏe và những người đam mê hoạt động ngoài trời. Thị trấn nghỉ mát trên núi này từng là nơi nghỉ dưỡng mùa hè của người Pháp, những người đã để lại dấu ấn với kiến trúc lấy cảm hứng từ châu Âu và vô số hồ nước. Hồ chính của Đà Lạt là trung tâm của hoạt động, nhưng những kỳ quan thiên nhiên tuyệt vời đang chờ đón bạn trên những ngọn đồi xung quanh."));
        arrayList.add(new DiaDiem("Côn Đảo",R.drawable.con_dao,"Côn Đảo, một hòn đảo xinh đẹp nhất Việt Nam, là điểm đến lý tưởng cho những ai muốn khám phá vẻ đẹp hoang sơ, tìm hiểu lịch sử và muốn trải nghiệm những khoảnh khắc khó quên cùng biển xanh cát trắng giữa ngàn khơi, Côn Đảo, trong qúa khứ, từng được biết đến là một địa ngục trần gian, nơi ghi dấu ấn lịch sử của một thời kỳ đấu tranh của dân tộc vừa hào hùng vừa bi thương còn in dấu trên vùng đất này. Côn Đảo ngày nay trở thành điểm du lịch lý tưởng cho những ai muốn kham phá vẻ đẹp hoang sơ và tìm hiểu lịch sử của đất nước Việt Nam. Nơi đây, bạn có thể lang thang để cảm nhận sâu sắc về quá khứ và khám phá thế giới đại dượng với dải san hô muôn màu cùng cánh rừng nguyên sinh với hệ động thực vật phòng phú và hơn hết là để thoát ly cuộc sống ồn ào của đô thị."));
        arrayList.add(new DiaDiem("Chợ Nổi Cái Răng",R.drawable.cho_noi_cai_rang,"Với tên gọi vừa hay vừa lạ đã là một niềm thích thú cho nhiều người tò mò rằng vì sao chợ lại có tên là Cái Răng, Cái Răng nghĩa là gì và ai là người đã đặt tên đó cho chợ nổi. Lý giải cho tên gọi “Cái Răng” thì người dân tại Cần Thơ kể theo một truyền thuyết như sau. Theo đó, tên gọi Cái Răng xuất phát từ câu chuyện hồi đầu thời khẩn hoang, lập ấp. Truyền thuyết nói về con cá sấu với thân hình rất lớn dạt vào đây, răng của nó cắm vào miệng đất này. Từ đó mà khi chợ nổi hình thành lên, người ta đã dùng tên Cái Răng để đặt cho chợ nổi. Tuy nhiên theo một số tài liệu nghiên cứu thì tên gọi Cái Răng là có nguồn gốc từ chữ của người Khmer là “karan” nghĩa là “cà ràng” (ông táo). Người Khmer ở Xà Tón (Tri Tôn) làm rất nhiều karan đi bán khắp nơi để phục vụ trong việc chế biến món ăn, đặc biệt là họ bán rất nhiều tại khu vực sông nước Cần Thơ này. Do từ khó đọc mà lâu dần, người Việt đã phát âm của chữ “karan” thành chữ “cà ràng” rồi Cái Răng."));
        arrayList.add(new DiaDiem("Cầu Vàng - Đà Nẵng",R.drawable.cau_vang,"Nhìn từ xa, cầu Vàng trong giống như đôi tay của thần núi đang hỗ trợ mọi người đến vườn Thiên Thai. Nhiều người nghĩ rằng, đôi tay nâng cầu trông giống như chạm khắc bằng đá, nhưng thực sự không phải như vậy. Các nhà thiết kế đã tạo ra nó bằng cách tạo khung xương tay bằng lưới thép, lấp đày bằng bê tông, sau đó kết thúc với lớp thủy tinh mịn bên ngoài và trang trí nó."));
        arrayList.add(new DiaDiem("Khu du lịch Đại Nam",R.drawable.dai_nam,"Khu du lịch Đại Nam - nơi vọng ngưỡng tâm linh và tôn vinh tinh hoa dân tộc trải dài qua 4.000 năm văn hiến của  Việt Nam. Những tác phẩm thơ ca được chạm trổ trên các hạng mục công trình ở đây đều do chính ông Huỳnh Uy Dũng khai tâm sáng tác. Trong mỗi áng thơ, trong từ câu chữ đều hàm chứa  những thông điệp xâu xa, đầy ý nghĩa để toàn thể Quý Du Khách cùng thưởng lãm và chiêm nghiệm"));
        arrayList.add(new DiaDiem("Đảo Phú Quốc",R.drawable.dao_phu_quoc,"Phú Quốc, thiên đường nhiệt đới nằm trong Vịnh Thái Lan, là hòn đảo lớn nhất của Việt Nam nằm ở phía Tây Nam, cũng là hòn đảo lớn nhất trong quần thể 22 đảo nhỏ to khác nhau tại đây. Phú Quốc cùng với các hòn đảo khác tạo thành huyện đảo Phú Quốc thuộc tỉnh Kiên Giang"));
        arrayList.add(new DiaDiem("Hồ Gươm",R.drawable.ho_guom_1661248781,"Hồ Hoàn Kiếm (hay còn gọi là Hồ Gươm) là trái tim của Hà Nội. Đây không chỉ là nơi để mọi người thả hồn đi dạo, hóng mát mà còn gắn liền với người dân thủ đô về nhiều phương diện lịch sử văn hóa cũng như đi vào trong thơ ca. Hồ Hoàn Kiếm là nơi tụ hội, điểm hẹn lý tưởng bốn mùa: Rực rỡ trong sắc đào và các lễ hội truyền thống vào mùa xuân; lồng lộng những cơn gió xua tan đi cái nóng oi bức của mùa hè; say đắm với những cành liễu rủ trong màn sương huyền ảo của mùa thu; lộng lẫy trong cơn mưa lá vàng và những giọt mưa phùn lất phất bay của mùa đông."));
        arrayList.add(new DiaDiem("Hội an",R.drawable.hoi_an,"Phố cổ Hội An là một thành phố nổi tiếng của tỉnh Quảng Nam, một phố cổ giữ được gần như nguyên vẹn với hơn 1000 di tích kiến trúc từ phố xá, nhà cửa, hội quán, đình, chùa, miếu, nhà thờ tộc, giếng cổ… đến các món ăn truyền thống, tâm hồn của người dân nơi đây. Một lần du lịch Hội An sẽ làm say đắm lòng du khách bởi những nét đẹp trường tồn cùng thời gian, vô cùng mộc mạc, bình dị"));
        arrayList.add(new DiaDiem("Vũng Tàu",R.drawable.vung_tau_1661248679,"Cách trung tâm thành phố Hồ Chí Minh chỉ khoảng 3 tiếng lái xe, với đường bờ biển trải dài 20km, Vũng Tàu là một trong những điểm đến yêu thích của du khách phía Nam. Nằm nhô hẳn ra khỏi đất liền như một dải đất, từ nơi đây, người ta có thể nhìn biển Đông cả khi trời mọc lẫn lúc hoàng hôn. Bên cạnh những giá trị cảnh quan thiên nhiên, Vũng Tàu còn là miền đất có truyền thống văn hóa lịch sử lâu đời."));
        arrayList.add(new DiaDiem("Miếu bà chúa xứ Núi sam",R.drawable.mieubachuaxu_nuisam,"Châu Đốc, một địa danh gắn liền với sự linh thiêng với thế phong thủy tiền tam giang, hậu thất sơn và huyền bí cùng nhiều tín ngưỡng tôn giáo tồn tại từ lâu đời. Nhắc tới mảnh đất này, người ta không thể không nhớ tới Miếu Bà Chúa Xứ Núi Sam là điểm du lịch tâm linh nổi tiếng không chỉ ở miền Tây Nam Bộ, mà ngay cả người Việt ở nước ngoài vẫn biết đến."));
        arrayList.add(new DiaDiem("Vịnh Hạ Long",R.drawable.vinh_ha_long,"Vịnh Hạ Long thuộc tỉnh Quảng Ninh, nằm ở phía Đông Bắc nước ta, diện tích khoảng 1.553km2 với 1.969 hòn đảo lô nhô tạo nên những cảnh sắc kỳ thú. Sự hiện diện của Vịnh và những hòn đảo trên Vịnh là những minh chứng độc đáo về lịch sử phát triển của trái đất, bao gồm đặc điểm địa chất và quá trình vận động, phát triển liên tục của dạng địa hình Karst hệ Fengcong và Fengling. Địa hình đặc biệt của Vịnh Hạ Long có liên quan chặt chẽ tới lịch sử khí hậu và quá trình vận động kiến tạo của trái đất. Những hòn đảo ở đây là mẫu hình khá lý tưởng về Karst hình thành trong điều kiện nhiệt đới, ẩm. Toàn bộ khu vực Vịnh Hạ Long là một cảnh quan Karst qua nhiều triệu năm, với các tháp karst hình chóp, hình tháp, bị bào mòn, tạo nên cảnh đẹp nổi bật, độc đáo toàn thế giới."));
        arrayList.add(new DiaDiem("Kinh Đô Huế",R.drawable.hue,"Nhắc đến Huế là người ta nhớ đến người con gái dịu dàng trong tà áo tím, là nhớ đến thành phố mang một nét đẹp trầm tư, sâu lắng mà bình dị đến đáng nhớ. Chứa đựng trong mình cả một giai đoạn lịch sử thông qua các di tích, nét trầm mặc cổ kính, điệu hát cung đình Huế âm trầm cùng với sông Hương, núi Ngự… tất cả đã tạo nên một cố đô Huế mộng mơ."));
        arrayList.add(new DiaDiem("Nha Trang",R.drawable.nha_trang,"Ngoài vui chơi trên biển, du khách có thể tham quan đảo khỉ, tháp bà Ponagar và thưởng thức món ngon của miền biển. Nha Trang, thành phố biển nằm tại vị trí trung tâm tỉnh Khánh Hòa, từ lâu đã là một trong những điểm du lịch hút khách nhất Việt Nam. Được thiên nhiên ban tặng những bãi biển, vùng vịnh đẹp cùng nhiều đảo lớn nhỏ, thành phố còn sở hữu nhiều danh lam thắng cảnh, điểm tham quan, vui chơi và cơ sở nghỉ dưỡng."));
        arrayList.add(new DiaDiem("Nhà thờ Đức Bà",R.drawable.nhatho_ducba,"Được ví như biểu tượng của thành phố Hồ Chí Minh, nhà thờ Đức Bà là một trong những công trình kiến trúc độc đáo của Sài Gòn. Trải qua nhiều năm đón gió, phơi sương, nơi đây vẫn giữ nguyên nét kiến trúc cổ kính và ấn tượng như thuở ban đầu"));
        arrayList.add(new DiaDiem("Núi Bà Đen",R.drawable.nui_baden_tayninh,"Núi Bà Đen lúc ẩn hiện dưới gợn mây bảng lảng trong sương, lúc lại nổi bật trên nền trời xanh. Hành trình du lịch núi Bà Đen Tây Ninh luôn mê hoặc hàng nghìn du khách yêu thích khám phá, tìm hiểu về vùng đất nắng gió này."));
        arrayList.add(new DiaDiem("Núi Cấm",R.drawable.nui_cam,"Mảnh đất An Giang nổi tiếng bởi cảnh quan thiên nhiên nhuốm màu sắc huyền bí, trong đó phải kể đến vùng Bảy Núi hay Thất  Sơn. Nổi bật trong dãy Thất Sơn là ngọn núi Cấm cao khoảng 710m so với mực nước biển trung bình. Núi Cấm còn gọi là Thiên Cấm Sơn, nằm ngay trung tâm của vùng Bảy núi chính vì thế núi Cấm có vẻ đẹp hoang sơ, hùng vĩ. Đặc biệt, đỉnh Bồ Hong ở trên núi Cấm chính là đỉnh núi cao nhất trong Thất Sơn và cũng là ngọn núi cao nhất Đồng Bằng Sông Cửu Long. Với khí hậu mát mẻ được ví như một phiên bản “Đà Lạt” của miền Tây, Núi Cấm trở thành điểm tham quan, vui chơi, chiêm bái hấp dẫn bậc nhất trong các điểm du lịch An Giang."));
        arrayList.add(new DiaDiem("Sapa",R.drawable.phanxipang_sapa_1661249040,"Sapa là một địa điểm du lịch nổi tiếng thuộc tỉnh Lào Cai, nằm tại phía Bắc của nước ta. Nhờ được tạo hóa ưu ái mà thiên nhiên Sapa hiện lên như một bức tranh tiên cảnh đầy tráng lệ nhưng cũng không kém phần thơ mộng."));
        arrayList.add(new DiaDiem("Suối Tiên",R.drawable.suoi_tien,"Khu du lịch Suối Tiên Thành Phố Hồ Chí Minh là một công viên liên hợp vui chơi giải trí kết các yếu tố truyền thống văn hóa - lịch sử - tâm linh tại quận 9, thành phố Thủ Đức. Phong cách kiến trúc và các thể loại vui chơi được đan xen vào các hình ảnh nhân vật lịch sử và truyền thuyết Việt Nam như Lạc Long Quân - Âu Cơ, Vua Hùng, Sơn Tinh Thủy Tinh, mười tám tầng địa ngục, tứ linh hội tụ Long - Lân - Quy - Phụng tướng ứng với ngũ hành Kim - Mộc -Thủy - Hỏa - Thổ"));


        adapterDiaDiem = new AdapterDiaDiem(MainActivity.this,R.layout.activity_detail,arrayList);
        listView.setAdapter(adapterDiaDiem);

        /*listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,DetailActivity.class);
                    startActivity(intent);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*/
    }
}