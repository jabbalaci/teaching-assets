namespace Example
{
    public class Student
    {
        private string name;
        private int age;
        private string major;

        public Student(string line)
        {
            var parts = line.Split(",");

            this.name = parts[0].Capitalize();
            this.age = int.Parse(parts[1]);
            this.major = parts[2].ToUpper();
        }

        public string GetName()
        {
            return name;
        }

        public int GetAge()
        {
            return age;
        }

        public string GetMajor()
        {
            return major;
        }

        public override string ToString()
        {
            return $"Student(name={name}, age={age}, major={major})";
        }
    }
}
