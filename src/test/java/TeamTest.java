import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TeamTest {

    @Test
    void test() {
        TeamController teamController = DiService.getObject(TeamController.class);
        assertNotNull(teamController);
        assertNotNull(teamController.teamService);
    }
}
