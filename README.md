# spring-override-config-class
Spring Boot example that overwrite an config class in tests scope.

Exemplo de Spring Boot que sobrescreve uma classe de configuração no escopo de testes.

Trechos dos códigos de testes:




@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ConfigProperties.class})
@EnableAutoConfiguration
public class ConfigPropertiesTest {
    
    public ConfigPropertiesTest() {
    }
    
    @Autowired
    ConfigProperties configProperties;
     
    
    /**
     * Testa o carregamento do properties com os códigos do projeto (sem configuracao de teste).
     * O teste somente passará se não existir a classe ConfigProperties dentro dos pacotes de testes.
     * Para esse teste passar é necessário renomear a classe ConfigProperties do src/test para ConfigPropertiesOff.
     */
    //@Test
    public void configPropertiesDefaultTest() {
        String appName = configProperties.getAppName();
        
        System.out.println("NOME APP: " + appName);
        assertEquals("APPNAME (PROD)", appName);
    }
    
    /**
     * Testa o carregamento do properties com os códigos do pacote de testes.
     * Ou seja, sobreescreve as configurações do projeto.
     * O teste somente passará se existir a classe ConfigProperties e o arquivo
     * application_2.properties dentro dos pacotes de testes.
     * OBSERVAÇÃO: O arquivo application_2.properties pode ficar tanto no src/main
     * quanto no src/test que o méto passa nos dois cenários.
     * 
     */
    @Test
    public void configPropertiesTestScopeTest() {
        String appName = configProperties.getAppName();
        
        System.out.println("NOME APP: " + appName);
        assertEquals("APPNAME (TEST)", appName);
    }

.......