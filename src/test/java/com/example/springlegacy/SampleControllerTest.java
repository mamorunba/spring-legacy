package com.example.springlegacy;

//@RunWith(SpringRunner.class)
//@ContextConfiguration
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SampleControllerTest {
//    private MyRequestData reqdata = new MyRequestData();
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//
//    @Before
//    public void initialize() {
//        reqdata.setUserId("user");
//        reqdata.setPassword("password");
//        reqdata.setMessage("test");
//    }
//
//    @Test
//    public void testLogin() throws URISyntaxException {
//        RequestEntity<MyRequestData> requestEntity = RequestEntity.post(new URI("/login"))
//                .accept(MediaType.APPLICATION_JSON).body(reqdata);
//
//        ResponseEntity<MyResponseData> responseEntity = restTemplate.exchange(requestEntity, MyResponseData.class);
////        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
//        Assert.assertThat(responseEntity.getStatusCode(), CoreMatchers.equalTo(HttpStatus.OK));
//
//        List<String> expectedMsges = Arrays.asList("TEST DATA");
////        assertThat(responseEntity.getBody().getMessages()).isEqualTo(expectedMsges);
//
//    }
}
