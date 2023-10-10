import static org.junit.jupiter.api.Assertions.*;

class StudentRepoTest {

    @org.junit.jupiter.api.Test
    public void findStudentById() {
        // Given
        StudentRepo repo = new StudentRepo();

        // When
        IllegalArgumentException thrownException = assertThrows(IllegalArgumentException.class, () -> {
            repo.findStudentById("nonexistent.Id");
        });

        // Then
        assertEquals("Student with id nonexistent.Id not found", thrownException.getMessage());
    }
}
